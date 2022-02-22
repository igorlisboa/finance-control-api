package br.com.financial.financecontrolapi.services;

import br.com.financial.financecontrolapi.entities.LaunchTypeEntity;
import br.com.financial.financecontrolapi.dto.LauchTypeDTO;
import br.com.financial.financecontrolapi.repositories.LaunchTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LauchTypeService {

    @Autowired
    private LaunchTypeRepository launchTypeRepository;

    public List<LauchTypeDTO> findAll(){
        List<LaunchTypeEntity> typeRepositoryAll = launchTypeRepository.findAll();
        List<LauchTypeDTO> lauchTypeDTOS = new ArrayList<>();
        if (!typeRepositoryAll.isEmpty()){
            typeRepositoryAll.forEach(item -> {
                lauchTypeDTOS.add(converterToModel(item));
            });
        }
        return lauchTypeDTOS;
    }

    public LauchTypeDTO insert(LauchTypeDTO lauchTypeDTO){
        LaunchTypeEntity save = launchTypeRepository.save(converterToEntity(lauchTypeDTO));

        return converterToModel(save);
    }

    public LauchTypeDTO update(LauchTypeDTO lauchTypeDTO){
        LaunchTypeEntity save = launchTypeRepository.save(converterToEntity(lauchTypeDTO));
        return converterToModel(save);
    }

    public Boolean delete(LauchTypeDTO lauchTypeDTO){
        launchTypeRepository.delete(converterToEntity(lauchTypeDTO));
        return launchTypeRepository.existsById(lauchTypeDTO.getCode());
    }

    private LauchTypeDTO converterToModel(LaunchTypeEntity entity) {
        LauchTypeDTO model = new LauchTypeDTO();
        model.setCode(entity.getId());
        model.setType(entity.getType());
        model.setDescription(entity.getDescription());
        return model;
    }

    private LaunchTypeEntity converterToEntity(LauchTypeDTO model) {
        LaunchTypeEntity entity = new LaunchTypeEntity();
        if(model.getCode() != null){
            entity.setId(model.getCode());
        }
        entity.setType(model.getType());
        entity.setDescription(model.getDescription());

        return entity;
    }

}
