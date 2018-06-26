<?php

namespace common\adapter;


class Database implements Db
{
    private $db;

    public function __construct($db)
    {
        $this->db = $db;
    }

    public function connect()
    {
        $this->db->connect();
    }

    public function query($sql)
    {
        $this->db->query($sql);
    }

}