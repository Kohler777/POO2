package org.usuario.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField txtnome;
    @FXML
    private TextField txtpassword;
    @FXML
    private TextField btnSalvar;
    @FXML
   public void onBtnSalvarAction(){
        System.out.println("Clique Salvar");
    }
}