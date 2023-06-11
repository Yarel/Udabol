FROM nginx:latest

# Copiar los archivos de la aplicación
COPY frontend /usr/share/nginx/html
EXPOSE 80 
CMD ["nginx", "-g", "daemon off;"]
