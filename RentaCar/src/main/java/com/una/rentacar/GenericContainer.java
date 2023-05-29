/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.rentacar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class GenericContainer<KeyType,ValueType> {

   

        private final KeyType key;
        private final ValueType value;
        private static final List<GenericContainer> c = new ArrayList<>();

        public GenericContainer(KeyType k, ValueType v) {
            this.key = k;
            this.value = v;
        }

        public KeyType getKey() {
            return this.key;
        }

        public boolean put(GenericContainer obj) {
            if (obj != null) {
                c.add(obj);
                return true;
            }
            return false;
        }

        public Object getValue(KeyType k) {
            if (k != null) {
                for (GenericContainer obj : c) {
                    if (obj.getKey().equals(k)) {
                        return obj.value;
                    }
                }
            }
            return null;
        }
    }

