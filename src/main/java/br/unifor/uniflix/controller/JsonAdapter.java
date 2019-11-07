package br.unifor.uniflix.controller;

import javax.json.JsonObject;

import org.json.JSONObject;

import br.unifor.uniflix.model.Filme;

interface JsonAdapter <T>{
	T adapter(JSONObject jsonResponse);
  
}
