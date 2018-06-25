<?php

namespace test;
use common\ObjIterator;

class iterator
{
    public function index()
    {
        $iterator = new ObjIterator();
        foreach ($iterator as $v){
            echo $v;
        }
    }
}