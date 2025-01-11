package com.stock.supplier.supplierController;

import com.stock.supplier.model.Supplier;
import com.stock.supplier.model.SupplierDto;
import com.stock.supplier.supplierService.SupplierService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SupplierController {
    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    //add
    @PostMapping
    public ResponseEntity<Supplier> saveSupplier(@RequestBody SupplierDto supplierDto){
        Supplier saveSupplier = supplierService.saveSupplier(supplierDto);
        return new ResponseEntity<>(saveSupplier, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Supplier>> getAllSupplier (){
        return ResponseEntity.ok(supplierService.getAllSupplier());
    }

    //delete
    @DeleteMapping("/{id}")
    public ResponseEntity <String> deleteSupplier (@PathVariable Long id){
        Supplier supplier = new Supplier();
        supplierService.deleteSupplier(id);
        return ResponseEntity.ok("Deletado com suce" + supplier);
    }

}
