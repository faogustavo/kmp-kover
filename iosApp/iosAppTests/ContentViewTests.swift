//
//  ContentViewTests.swift
//  iosAppTests
//
//  Created by Gustavo Fão Valvassori on 17/10/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import SwiftUI
import XCTest
import SnapshotTesting
@testable import iosApp

class ContentViewTests : XCTestCase {
    
    func test_textRenderedAsExpected() {
        assertSnapshot(
            matching: UIHostingController(rootView: ContentView()),
            as: .image
        )
    }
}
