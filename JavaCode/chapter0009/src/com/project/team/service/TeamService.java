package com.project.team.service;

import com.project.team.domain.Architect;
import com.project.team.domain.Designer;
import com.project.team.domain.Employee;
import com.project.team.domain.Programmer;

/**
 * ClassName: TeamService
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/8 21:18
 * @Version 1.0
 */
public class TeamService {
    private static int counter = 1;    //  开发团队新增成员自动生成团队中的唯一ID，即TeamId
    private final int MAX_MEMBER = 5;   // 开发团队最大成员数
    private Programmer[] team = new Programmer[MAX_MEMBER];     // 保存开发团队中的各成员对象
    private int total;          // 团队成员的实际人数

    /**
     * 回当前团队的所有对象
     * @return 包含所有成员对象的数组，数组大小与成员人数一致, 有几个就返回几个
     */
    public Programmer[] getTeam() {
        // 可能开发组就一个开发人员,所以临时造一个team,这样打印时不会出现四个空白
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total;i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException{

        //成员已满，无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }

        //该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        Programmer p = (Programmer) e;
        Status status = p.getStatus();
        //该员工已是某团队成员
        //该员工正在休假，无法添加
        switch (status) {
            case BUSY:
                throw new TeamException("该员工已是某团队成员");
            case VACATION:
                throw new TeamException("该员工正在休假，无法添加");
        }

        //该员工已在本开发团队中
        boolean isExist = isExist(p);
        if (isExist) {
            throw new TeamException("该员工已在本开发团队中");
        }


        // 记录程序员、设计师、架构师的个数
        int arcNum = 0, desNum = 0, proNum = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect){
                arcNum++;
            } else if (team[i] instanceof Designer) {
                desNum++;
            } else {
                proNum++;
            }
        }

        //团队中至多只能有一名架构师
        //团队中至多只能有两名设计师
        //团队中至多只能有三名程序员
        if (p instanceof Architect) {
            if (arcNum >= 1) {  //团队中至多只能有一名架构师
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (desNum >= 2) {  //团队中至多只能有两名设计师
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else {                //团队中至多只能有三名程序员
            if (proNum >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }
        // 加入此工作人员到开发组中,并将total + 1
        team[total++] = p;
        // 将teamID+1, 并且此工作人员拿到teamID
        p.setTeamID(counter++);
        // 将此工作人员的工作状态 改为 BUSY
        p.setStatus(Status.BUSY);
    }

    /**
     * 从团队中删除成员
     * @param teamID 待删除成员的memberId
     * @throws TeamException 找不到指定teamID的员工，删除失败
     */
    public void removeMember(int teamID) throws TeamException{
        int i = 0;
        for (; i < total; i++) {
           if (team[i].getTeamID() == teamID) {
               team[i].setStatus(Status.FREE);
               break;
           }
        }
        //没找到
        if (i == total) {
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }

        //调整数组
        for (int j = i; j < total-1; j++) {
            team[j] = team[j + 1];
        }

        //        team[total-1] = null;
        //        total--;
        // 最后一位手动给一个Null,并将total-1
        team[--total] = null;

    }

    /**
     * 判断p是否存在于当前的开发团队中
     * @param p
     * @return
     */
    private boolean isExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId()) {
                return true;
            }
        }
        return false;
    }

}
