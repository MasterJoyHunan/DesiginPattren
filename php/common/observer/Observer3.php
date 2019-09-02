<?php

namespace common\observer;


class Observer3 implements Observer
{
    public function update()
    {
        echo __CLASS__ . ' update () <br />';
    }

}