ALTER TABLE prestamo ADD FOREIGN KEY (id_usuario) REFERENCES persona(id)
ALTER TABLE prestamo ADD FOREIGN KEY (id_ejemplar) REFERENCES ejemplar(idE)
ALTER TABLE prestamo ADD FOREIGN KEY (id_libro) REFERENCES libro(idl)