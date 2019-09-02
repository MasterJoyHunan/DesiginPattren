<?php
/**
 * Created by PhpStorm.
 * User: master-joy
 * Date: 2018/6/22
 * Time: 22:37
 */

namespace test;
use common\{Register as RegisterClass, Database};

class register
{
    /**
     * 在初始化的时候依赖注入
     * register constructor.
     */
    public function __construct()
    {
        $db = new Database();
        RegisterClass::set('db', $db);
    }

    /**
     * 在有需要的地方获取
     */
    public function index(){
        $db = RegisterClass::get('db');
        echo $db->find();
    }
}