package com.irontech.ironfood.di.notificacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME) 	
public @interface TipoNotificador {
	
	NivelUrgencia value();

}
