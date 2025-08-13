import Foundation

@objc(SessionDiagnostics)
class SessionDiagnostics: NSObject {
  @objc(cacheAuthHint:withValue:)
  func cacheAuthHint(serverUrl: String, value: String) {
    let key = "diag.session.\(serverUrl).hint"
    UserDefaults.standard.set(value, forKey: key)
  }

  @objc static func requiresMainQueueSetup() -> Bool { return false }
}


