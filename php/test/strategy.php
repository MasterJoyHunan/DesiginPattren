<?php

namespace test;
use common\{CatStrategy, DogStrategy, Animal};

class strategy
{
    public function index()
    {
        $animal = new Animal();
        if(isset($_GET['dog'])){
            $animal->setStrategy(new DogStrategy());
        }else{
            $animal->setStrategy(new CatStrategy());
        }
        $animal->index();
    }


    public function badexp()
    {
        if(isset($_GET['dog'])){
            $animal = new DogStrategy();
        }else{
            $animal = new CatStrategy();
        }
        $animal->eat();
        echo '<hr>';
        $animal->shout();
    }

}