<?php

namespace test;
use common\Proxy as Proxys;

class proxy
{
    public function index()
    {
        $proxy = new Proxys();
        $proxy->getUserInfo(1);
        $proxy->setUserInfo(1, 'xxx');
    }
}