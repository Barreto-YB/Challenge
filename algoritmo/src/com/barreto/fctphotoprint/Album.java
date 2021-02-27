/**
 * 
 */
package com.barreto.fctphotoprint;

import com.barreto.estruturas.Fila;

/**
 * @author Yuri Barreto
 *
 */
public class Album {
	
	/**
	 * Atributos
	 */
	private Integer codigo;
	private boolean estado;
	private Fila<Photo> photos;
	
	public Album(Integer codigo) {
		this.codigo = codigo;
		estado = false;
		photos = new Fila<Photo>(); 
	}
	
	/**
	 * permitir fazer inserçao das photos
	 * returna -1 se nao efetuar a insercao com sucesso, caso contrario returna 1
	 * @param photo
	 * @return -1 ou 1
	 */
	public void adicionar(Photo photo) {
		if(estado ) 
			photos.enqueue(photo);
	}
	
	/**
	 * permitir fazer remocao das photos
	 * returna -1 se nao efetuar a remocao com sucesso, caso contrario returna 1
	 * @param photo
	 * @return -1 ou 1
	 */
	public Photo remover() {
		return photos.dequeue();
	}
	
	/**
	 * permite mudar o valor do estado
	 */
	public void setEstado() {
		estado = true;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public Photo findPhoto(int index) {
		return photos.getElement(index);
	}
	
	public int size() {
		return photos.size();
	}
}
