package codeBlock.src.service;
import codeBlock.src.enums.roles;
import java.util.ArrayList;

public interface BasicNeedsService {
    default ArrayList<String> getAllowedModulesByRole(roles role){
        ArrayList<String> permissionsArray = new ArrayList<String>();
        switch (role){
            case STUDENT:
                permissionsArray.add("VIEW_COURSES");
                break;
            case TEACHER:
                permissionsArray.add("VIEW_COURSES");
                permissionsArray.add("EDIT_COURSES");
                break;
        }
        return permissionsArray;
    }

}
