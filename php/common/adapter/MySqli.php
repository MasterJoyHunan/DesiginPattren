<?php
/**
 * Created by PhpStorm.
 * User: master_joy
 * Date: 2018/6/26
 * Time: 9:17
 */

namespace common\adapter;


class MySqli implements Db
{
    public function connect()
    {
        echo '使用mysqli连接数据';
    }

    public function query($sql)
    {
        echo '使用mysqli 增删改查数据库 [ ' . $sql . ' ]';
    }

}