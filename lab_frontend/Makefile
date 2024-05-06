.PHONY: build run stop

build:
	docker build -t udabol .

run:
	docker stop udabol || true
	docker run -d --rm --name udabol -p 8080:80 udabol

stop:
	docker stop udabol

