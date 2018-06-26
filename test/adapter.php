<?php

namespace test;
use common\adapter\{Database, MySql, MySqli, PDO};
class adapter
{
    public function index()
    {
//        $use = new MySql();
//        $use = new PDO();
        $use = new MySqli();
        $db = new Database($use);
        $db->connect();
        $db->query(' select * from user ');
    }
}