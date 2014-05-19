/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package addition;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Екатерина
 */
public class TestAddition {
    @Test(expected = Exception.class)
    public void testAdd(){
        op_addition val1 = new op_addition(3);
        op_addition val2 = new op_addition(3);
        op_addition exp = new op_addition(6);
        op_addition res = val1.add(val2);
        
        
        assertEquals(res,exp);
        assertEquals(new op_addition(4).add(new op_addition(5)),new op_addition(9));
        assertNotNull(val1);
        assertNotNull(val2);
       
    }
    
}
