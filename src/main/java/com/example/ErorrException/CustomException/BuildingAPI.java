package com.example.ErorrException.CustomException;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class BuildingAPI {

    public Object getBuilding(@RequestBody BuildingDTO buildingDTO) throws FielRequireException {
//        try{
//            System.out.println(5/0);
//            KiemTra(buildingDTO);
//        }catch (FielRequireException e){
//            ErrorResonseDTO errorResonseDTO = new ErrorResonseDTO();
//            errorResonseDTO.setError(e.getMessage());
//            List<String> details = new ArrayList<>() ;
//            details.add("Check lai");
//            errorResonseDTO.setDetail(details);
//            return errorResonseDTO ;
//        }
        // không cần try catch
        System.out.println(5/0);
        return null ;
    }

    public void KiemTra(BuildingDTO buildingDTO) {
        if(buildingDTO.getName() == null || buildingDTO.getEmail() == null){
            throw new FielRequireException("Error") ;

        }
    }
}
