<?php
namespace test;
use common\{Database, Setget};
class index
{
    public function index()
    {
        echo 'framework start';
    }
    /**
     *  链式调用
     */
    public function linkUse()
    {
        $res = new Database('user');
        echo $res->where(' id = 1 ')->limit(1)->find();

    }

    /**
     * 魔术方法
     */
    public function magicMethod()
    {
        $res = new Setget();
        //赋值不存在的变量会自动调用__set()
        $res->user = 1;
        //获取不存在的变量会自动调用__get()
        var_dump( $res->user);
        //调用不存在的方法会自动调用__call()
        $res->method(1,3,4);
        //调用不存在的静态方法会自动调用__callStatic()
        Setget::abc(3,4,5);
        //直接输出对象会调用__toString()
        echo $res;
        //把对象当成方法会自动调用__invoke()
        var_dump( $res());
    }

}