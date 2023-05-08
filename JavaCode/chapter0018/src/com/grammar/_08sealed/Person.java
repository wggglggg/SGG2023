package com.grammar._08sealed;

/**
 * ClassName: Person
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/8 19:59
 * @Version 1.0
 */

//Person是一个密封类，可以被指定的子类所继承。非指定的类不能继承Person类
public sealed class Person permits Teacher, Worker, Student{
}

//要求指定的子类必须是final、sealed、non-sealed三者之一
final class  Student extends Person{}   // final类无法再被 继承
sealed class Teacher extends Person permits SeniorTeacher{} //Teacher类只能被指定的
non-sealed class SeniorTeacher extends Teacher{}

non-sealed class Worker extends Person{} //Worker类在继承时，没有任何限制

class WatchWorker extends Worker{}

//class Farmer extends Person{}  无法继承Person,因为不在指定清单中


