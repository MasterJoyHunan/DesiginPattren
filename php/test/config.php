<?php
namespace test;
use common\Config as Configs;

class config
{
    public function index()
    {
        $config = new Configs();
        $res = $config->pull('DB');
        var_dump($res);
    }
}