 🤖 AI Chat Backend
🚀 AI-Powered Resume Chatbot & Cover Letter Generator

Generate intelligent responses and ATS-optimized cover letters using Spring AI and OpenRouter.

 ✨ Features

✅ AI Chat Assistant

✅ ATS-Friendly Cover Letter Generation

✅ Spring AI Integration

✅ OpenRouter API Integration

✅ REST APIs

✅ Environment Variable Support

✅ Production Ready Deployment

---

## 🛠️ Tech Stack

| Technology  | Version         |
| ----------- | --------------- |
| Java        | 21              |
| Spring Boot | 3.x             |
| Spring AI   | Latest          |
| Maven       | Latest          |
| OpenRouter  | GPT Models      |
| Render      | Deployment      |
| GitHub      | Version Control |

---

## 📁 Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.example.demo
│   │       ├── controller
│   │       ├── service
│   │       ├── dto
│   │       └── config
│   └── resources
│       ├── prompts
│       └── application.properties
└── test
```

---

## ⚙️ Configuration

### application.properties

```properties
spring.application.name=ai-chat

spring.ai.openai.api-key=${OPENROUTER_API_KEY}
spring.ai.openai.base-url=https://openrouter.ai/api
spring.ai.openai.chat.options.model=openai/gpt-3.5-turbo

server.port=${PORT:8080}
```

---

## 🔐 Environment Variables

Create the following environment variable:

```env
OPENROUTER_API_KEY=your_api_key_here
```

---

## ▶️ Run Locally

### Clone Repository

```bash
git clone https://github.com/your-username/ai-chat-backend.git
```

### Navigate

```bash
cd ai-chat-backend
```

### Build

```bash
mvn clean package
```

### Run

```bash
mvn spring-boot:run
```

---

## 🚀 Deployment

### Backend

* Render

### Frontend

* Vercel

### AI Provider

* OpenRouter

---

## 📡 API Endpoints

### Chat API

```http
POST /api/chat
```

### Cover Letter API

```http
POST /api/cover-letter
```

---

## 👨‍💻 Author

### Eswar Adithya

💼 Software Developer

☕ Java | Spring Boot | React | SQL

🚀 Passionate about AI, Cloud and Backend Development

---

<div align="center">

### ⭐ If you like this project, don't forget to star the repository ⭐

Made with ❤️ using Spring Boot

</div>
