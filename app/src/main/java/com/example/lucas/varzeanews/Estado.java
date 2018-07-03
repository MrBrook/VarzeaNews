package com.example.lucas.varzeanews;

public enum Estado {

    CLASSIFICADO{
        @Override
        public String toString() {
            return "classificado";
        }
    }, ELIMINADO{
        @Override
        public String toString() {
            return "eliminado";
        }
    };
}
