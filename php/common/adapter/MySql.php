<?php

namespace common\adapter;


class MySql implements Db
{
    public function connect()
    {
        echo '使用mysql连接数据';
    }

    public function query($sql)
    {
        echo '使用mysql 增删改查数据库 [ ' . $sql . ' ]';
    }

}