# 🧙‍♂️ Math Wizdom

**An interactive mathematics learning Android app designed to make math engaging and accessible for everyone.**

[![Version](https://img.shields.io/badge/version-0.6--beta-orange)](https://github.com/Venomous0511/math_wizdom/releases)
[![Status](https://img.shields.io/badge/status-beta-yellow)](https://github.com/Venomous0511/math_wizdom)
[![Android](https://img.shields.io/badge/Android-12+-green)](https://www.android.com)
[![License](https://img.shields.io/badge/license-MIT-blue)](LICENSE)

---

## 📖 About

Math Wizdom is an Android educational app that transforms traditional mathematics learning into an interactive and engaging mobile experience. Through carefully designed lessons, real-time feedback, and intuitive visualizations, students can master mathematical concepts at their own pace, right from their Android devices.

### ✨ Key Features

- **🎨 Modern Interface** - Clean, intuitive design optimized for Android devices
- **📚 Interactive Lessons** - Hands-on problem-solving with instant feedback
- **📊 Progress Tracking** - Monitor your learning journey and achievements
- **🗄️ Structured Content** - Organized lesson database for easy navigation
- **📱 Native Android** - Built specifically for Android 12+ devices
- **🎯 Personalized Learning** - Adaptive content based on your progress
- **⚡ Offline Support** - Learn anywhere, even without internet connection

---

## 🛠️ Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:
- **Android Studio** (Arctic Fox or newer recommended)
- **JDK 11** or higher
- **Android SDK** (API Level 31+)
- **Git**

### System Requirements

**For Development:**
- OS: Windows 10/11, macOS 10.14+, or Linux
- RAM: 8GB minimum (16GB recommended)
- Storage: 4GB minimum free space

**For Running the App:**
- Android device or emulator running **Android 12 (API 31)** or higher

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Venomous0511/math_wizdom.git
   cd math_wizdom
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned `math_wizdom` folder
   - Click "OK"

3. **Sync Gradle**
   - Android Studio will automatically prompt to sync Gradle
   - Click "Sync Now" and wait for dependencies to download

4. **Configure an Android Virtual Device (AVD)** *(Optional if using physical device)*
   - Go to Tools → Device Manager
   - Create a new virtual device with Android 12+ (API 31+)

5. **Run the app**
   - Connect your Android device via USB (with USB debugging enabled)
   - OR start your Android emulator
   - Click the "Run" button (green play icon) or press `Shift + F10`
   - Select your device and click "OK"

### Building APK

To build a debug APK:
```bash
./gradlew assembleDebug
```

The APK will be located at: `app/build/outputs/apk/debug/app-debug.apk`

To build a release APK:
```bash
./gradlew assembleRelease
```

---

## 🎯 Roadmap

### Current Focus (Beta Phase)
- [x] Room database implementation
- [x] Core lesson structure
- [x] Material Design UI
- [x] Interactive Activity
- [x] Interactive Lesson
- [ ] User authentication
- [ ] Progress analytics dashboard
- [ ] Lesson content expansion
- [ ] Activity content expansion

### Future Plans
- Advanced math topics (calculus, statistics)
- Gamification elements (badges, achievements)
- Cloud sync for cross-device progress
- Social learning features
- Tablet optimization
- iOS version development
- Multi-language support

---

## 🐛 Bug Reports & Feature Requests

Found a bug or have a suggestion? We'd love to hear from you!

- **Bug Report**: [Create a bug report](https://github.com/Venomous0511/math_wizdom/issues/new?template=bug_report.md)
- **Feature Request**: [Request a feature](https://github.com/Venomous0511/math_wizdom/issues/new?template=feature_request.md)

---

## 🤝 Contributing

We welcome contributions from the community! Here's how you can help:

1. **Fork the repository**
2. **Create a feature branch** (`git checkout -b feature/AmazingFeature`)
3. **Commit your changes** (`git commit -m 'Add some AmazingFeature'`)
4. **Push to the branch** (`git push origin feature/AmazingFeature`)
5. **Open a Pull Request**

---

## 🧪 Testing

Run the test suite:

```bash
# Run unit tests
./gradlew test

# Run instrumented tests (requires emulator/device)
./gradlew connectedAndroidTest

# Run tests with coverage report
./gradlew jacocoTestReport
```

---

## 👥 Team

- **Backend Developer**: [Venomous0511](https://github.com/Venomous0511)
- **Frontend Developer**: [Jeriellog](https://github.com/Jeriellog).

---

## 🙏 Acknowledgments

- Thanks to all beta testers for their valuable feedback
- Inspired by modern educational technology practices
- Built with passion for making math accessible to everyone

---

## 📬 Contact

Have questions or want to get in touch?

- **GitHub Issues**: [Report an issue](https://github.com/Venomous0511/math_wizdom/issues)

---

## ⚠️ Beta Notice

**This is beta software.** While we've tested thoroughly, you may encounter bugs or incomplete features. Please report any issues you find to help us improve Math Wizdom!

---

<div align="center">

**Made with ❤️ for math learners everywhere**

[⬆ Back to Top](#-math-wizdom)

</div>
