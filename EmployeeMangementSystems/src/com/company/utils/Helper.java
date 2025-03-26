package com.company.utils;

import com.company.inteface.interfaces;

public class Helper {
    public static boolean CheckifIDExists(int ID){
        for (int i = 0; i < interfaces.Last_index; i++) {
            if(interfaces.employees[i].getID() == ID)
            {
                return true;
            }
        }
        return false;
    }
    public static boolean CheckifAdmin(int ID){
        for (int i = 0; i < interfaces.Last_index; i++) {
            if(interfaces.employees[i].getID() == ID)
            {
                if(interfaces.employees[i].getJobTitle().equals("Admin"))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
