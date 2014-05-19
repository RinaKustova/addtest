/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package addition;

/**
 *
 * @author Екатерина
 */
public class op_addition {
    private int value;
    
    
    
    public op_addition(int v){
          value = v;
          
    }
    
    public op_addition add(op_addition v1){
        return new op_addition (value+v1.getValue());
    }
    public int getValue(){
        return value;
    }
     public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        op_addition other = (op_addition) obj;
        if (value != other.value)
            return false;
        
        return true;
    }
    
}
