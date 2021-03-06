package com.gcit.fashion.dao;

import com.gcit.fashion.model.Inventory;
import com.gcit.fashion.model.InventoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryDao extends JpaRepository<Inventory, InventoryId> {

}