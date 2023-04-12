// swift-tools-version:5.3
import PackageDescription

// BEGIN KMMBRIDGE VARIABLES BLOCK (do not edit)
let remoteKotlinUrl = "https://maven.pkg.github.com/ionel71089/KMMBridgeSampleKotlin/KMMBridgeSampleKotlin/shared-kmmbridge/0.8.9/shared-kmmbridge-0.8.9.zip"
let remoteKotlinChecksum = "d96d1b030a797424df321228fb017be48f109696af3e35e09e44b22e65d5507d"
let packageName = "shared"
// END KMMBRIDGE BLOCK

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)