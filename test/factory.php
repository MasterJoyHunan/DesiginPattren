<?php
namespace test;
use common\Factory as FactoryPattren;

class factory
{
    /**
     * 工厂模式直接获取对象, 不需要实例化
     */
    public function index()
    {
        $db = FactoryPattren::createDatabase();
        var_dump($db);
    }
}

