<?php
    class Noticia{
        public $titulo; 
        public $fecha; 

        public function __construct($titulo, $fecha){
            $this->titulo = $titulo; 
            $this->fecha = $fecha; 
        }
    }
?>