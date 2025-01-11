package com.stock.supplier.supplierService;

import com.stock.supplier.model.Supplier;
import com.stock.supplier.model.SupplierDto;
import com.stock.supplier.supplierRepository.SupplierRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class SupplierService {
    private final SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    //Add
    public Supplier saveSupplier (SupplierDto supplierDto){
        Supplier supplier = new Supplier();
        supplier.setName(supplierDto.getName());
        return supplierRepository.save(supplier);
    }

    //list
    public List<Supplier> getAllSupplier (){
        return supplierRepository.findAll();
    }

    //delete
    public void deleteSupplier (@PathVariable long id){
        supplierRepository.existsById(id);
        supplierRepository.deleteById(id);
    }
}
