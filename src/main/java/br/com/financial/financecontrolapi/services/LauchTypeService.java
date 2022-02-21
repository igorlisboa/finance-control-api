package br.com.financial.financecontrolapi.services;

import br.com.financial.financecontrolapi.entities.LaunchTypeEntity;
import br.com.financial.financecontrolapi.model.LauchTypeModel;
import br.com.financial.financecontrolapi.repositories.LaunchTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LauchTypeService {

    @Autowired
    private LaunchTypeRepository launchTypeRepository;

    public LauchTypeModel insert(LauchTypeModel lauchTypeModel){
        LaunchTypeEntity save = launchTypeRepository.save(converterToEntity(lauchTypeModel));

        return converterToModel(save);
    }

    private LauchTypeModel converterToModel(LaunchTypeEntity entity) {
        LauchTypeModel model = new LauchTypeModel();
        model.setCode(entity.getId());
        model.setType(entity.getType());
        model.setDescription(entity.getDescription());
        return model;
    }

    private LaunchTypeEntity converterToEntity(LauchTypeModel model) {
        LaunchTypeEntity entity = new LaunchTypeEntity();
        if(model.getCode() != null){
            entity.setId(model.getCode());
        }
        entity.setType(model.getType());
        entity.setDescription(model.getDescription());

        return entity;
    }

}