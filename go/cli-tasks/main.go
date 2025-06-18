package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
)

var tasks []string
var reader = bufio.NewReader(os.Stdin)

func login() bool {

	fmt.Printf("Enter Password: \n")
	var input string
	fmt.Scanln(&input)

	if input == "1234" {
		return true
	}

	return login()
}

func initTasks() {
	tasks = []string{"get milk", "clean room", "wash clothes"}
}

func showTasks() {
	if len(tasks) == 0 {
		fmt.Println("Tasks list is currently empty")
		return
	}

	for i, v := range tasks {
		fmt.Printf("%d: %s\n", i+1, v)
	}
}

func deleteTask() {
	showTasks()
	fmt.Println("Enter Task Id to delete Task: ")
	var id int
	fmt.Scanln(&id)

	if id <= 0 && id > len(tasks) {
		fmt.Println("Invalid ID")
		return
	}

	id = id - 1
	tasks = append(tasks[:id], tasks[id+1:]...)
	fmt.Println("Deleting Task...")
}

func editTask() {

	showTasks()

	fmt.Println("Enter Task Id to edit Task: ")
	var id int
	fmt.Scanln(&id)

	if id <= 0 && id > len(tasks) {
		fmt.Println("Invalid ID")
		return
	}

	fmt.Printf("Enter Updated Task: \n")
	input, err := reader.ReadString('\n')
	if err != nil {
		log.Fatal(err)
	}
	id = id - 1
	tasks[id] = input

}

func addTask() {
	fmt.Printf("Enter New Task: \n")
	reader.Reset(reader)
	input, err := reader.ReadString('\n')
	if err != nil {
		log.Fatal(err)
	}

	tasks = append(tasks, input)
	fmt.Printf("New Task Added\n")
}

func acceptCommand() {
	var command string
	fmt.Println("\nEnter a command:\n'a <new-task-title>' - add new task\n'd <task-no>' - delete task\n'e <task-no>' - edit task\n'q' - quit application")

	fmt.Scanln(&command)

	if command == "q" {
		os.Exit(0)
	} else if command == "d" {
		deleteTask()
	} else if command == "e" {
		editTask()
	} else if command == "a" {
		addTask()
	} else {
		fmt.Println("Invalid Command Entered. Please Enter again")
	}

}

func main() {

	loggedIn := login()

	if loggedIn {
		// todo read from encrypted file
		initTasks()
		for {
			showTasks()
			acceptCommand()
		}
	}
}

// var command, data string

// 	scanf, err := fmt.Scanf("%s %s", &command, &data)
// 	if scanf != 2 {
// 		fmt.Println("Not 2", scanf)

// 		return
// 	} else {
// 		if command == "q" {
// 			os.Exit(0)
// 		} else if command == "d" {
// 			deleteTask()
// 		} else if command == "e" {
// 			editTask()
// 		} else if command == "a" {
// 			addTask()
// 		} else {
// 			fmt.Println("Invalid Command Entered. Please Enter again")
// 		}
// 	}
// 	if err != nil {
// 		fmt.Println("Input Number error, Please run program again")
// 		return
// 	}
