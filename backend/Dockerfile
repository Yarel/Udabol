# Imagen base
FROM node:14

# Directorio de trabajo
WORKDIR /app

# Copiar los archivos necesarios
#COPY package.json package-lock.json /app/
#COPY app.js /app/
COPY * /app/
# Instalar las dependencias
RUN npm install --save-dev @babel/core @babel/cli @babel/preset-env
RUN npm install express node-fetch
RUN npm install

# Puerto expuesto por la aplicación
EXPOSE 3000

# Comando de inicio de la aplicación
CMD [ "node", "app.js" ]

