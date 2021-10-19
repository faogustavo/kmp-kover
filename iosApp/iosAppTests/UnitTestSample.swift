//
//  UnitTestSample.swift
//  iosAppTests
//
//  Created by Gustavo Fão Valvassori on 18/10/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import XCTest

class SumTest : XCTestCase {
    
    func test_sumTwoAndThree_returnsFive() {
        let result = 2 + 3
        XCTAssertEqual(5, result)
    }
}
