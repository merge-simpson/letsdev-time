<table border="3">
<tr height="45">
  <td width="45">
    🏗
  </td>
  <td>
    Constructing . . .
  </td>
</tr>
</table>

# Features

밀리초를 `long`으로 반환하는 함수만 초기에 필요에 따라 추가되었습니다.  
다른 기능은 추후 도입하려고 합니다.

- MillisecondSupplier
- SystemMilliSeconds

# Installation

```kotlin
repositories {
    maven { url = uri("https://jitpack.io") } // added
}

dependencies {
    implementation("com.github.merge-simpson:letsdev-time:0.1.0-rc1")
}
```