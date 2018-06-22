<?php

namespace test;
use common\{Factory, Orm as OrmClass};

class orm
{
    public function index()
    {
        $orm = Factory::getFileOrm();
        $flag = $orm->delete();
        echo $flag ? '删除成功' : '删除失败';
    }

    public function badexp()
    {
        $orm = new OrmClass();
        $flag = $orm->setData('aaa')->save();
        echo $flag ? '保存成功' : '保存失败';
    }
}