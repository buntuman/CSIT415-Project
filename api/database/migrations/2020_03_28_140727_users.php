<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class Users extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        //Below are defined columns 
        Schema::create('users',function (Blueprint $table){
            $table->bigIncrements('id');
            $table->string('last_name');
            $table->string('first_name');
            $table->string('uname');
            $table->string('email')->unique();
            $table->string('password');
            $table->string('isAdmin');
            $table->timestamps();

        });

    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        //
    }
}
