/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author kaurg
 */
public class WarCard extends Card{
    
    
     public WarCard(int rank) {
        super(rank);
     
    }
     
     @Override
    public  String toString(){
  return "WarCard: Rank " + getRank(); }
    
}
