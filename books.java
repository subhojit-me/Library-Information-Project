/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libaryproject;

/*
 * @author Subhojit
 */
class books {
    private String name,author;
    private int avl,no;
    public books(String name, String author, int avl, int no){
           this.name=name;
           this.author=author;
           this.avl=avl;
           this.no=no;
    }
    public int getno(){
        return no;
    }
    public int getavl(){
        return avl;
    }
    public String getname(){
        return name;
    }
    public String getauthor(){
        return author;
    }
}