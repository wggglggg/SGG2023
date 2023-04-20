package com.polymorphism.exer4;

/**
 * ClassName: Exer4
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 10:39
 * @Version 1.0
 */
public class Exer4 {

    public static void main(String[] args) {
//        Exer4 exer4 = new Exer4();
        Person[] people = new Person[] {
                new Man(),
                new Woman(),
                new Woman(),
        };

        meeting(people);
    }

    public static void meeting(Person ... ps) {
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();

            if (ps[i] instanceof Man) {
                Man man = (Man) ps[i];
                man.smoke();
            } else if (ps[i] instanceof Woman) {
                Woman woman = (Woman) ps[i];
                woman.makeup();
            }

            System.out.println();
        }
    }


}
