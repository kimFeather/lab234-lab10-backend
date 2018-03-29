package camt.se234.lab10.service;

import camt.se234.lab10.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        if(score >= 80)
            return "A";
        if(score >= 75)
            return  "B";
        if(score >= 60)
            return "C";
        if (score >= 33)
            return "D";
        else
            return "F";


    }
}
