package com.xworkz.register.service;

import com.xworkz.register.entity.RegisterEntity;

public interface RegisterService {
    boolean validateAndSave(RegisterEntity entity);
}
