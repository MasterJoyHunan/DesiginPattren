<?php

namespace common;

/**
 * 代理模式, 用接口方式编程
 * 典型应用场景 (读写分离, 主从结构)
 * Class Proxy
 * @package common
 */
class Proxy
{
    /**
     * 从slave数据库读取数据
     */
    public function getUserInfo($id)
    {
        $db = Factory::createDatabase()->setDatabase(false);
        echo $db->query("select * from xxx where id = {$id}");
    }

    /**
     * 从master数据库写入数据
     */
    public function setUserInfo($id, $name)
    {
        $db = Factory::createDatabase()->setDatabase(true);
        echo $db->query("update  xxx set name = {$name} where id = {$id}");
    }
}