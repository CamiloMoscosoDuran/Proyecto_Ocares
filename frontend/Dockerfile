# Usamos Nginx para servir el archivo estático
FROM nginx:alpine

# Copiamos nuestro index.html a la carpeta por defecto de Nginx
COPY index.html /usr/share/nginx/html/index.html

# Exponemos el puerto 80
EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
