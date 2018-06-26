<?php

namespace test;
use common\facade\Facade as Facades;

class facade
{
    public function index()
    {
        $facade = new Facades();
        $facade->index();
    }
}