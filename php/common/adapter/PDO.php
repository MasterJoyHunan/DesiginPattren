<?php

namespace common\adapter;


class PDO implements Db
{
    public function connect()
    {
        echo '使用PDO连接数据';
    }

    public function query($sql)
    {
        echo '使用PDO 增删改查数据库 [ ' . $sql . ' ]';
    }

}