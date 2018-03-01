/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libaryproject;

/**
 *
 * @author Subhojit
 */
class RentBook {
    int bno;
    String bname;
    public RentBook(int no, String name){
        this.bname = name;
        this.bno = no;
    }
    public int get_bno(){
        return this.bno;
    }
    public String get_bname(){
        return this.bname;
    }
}
