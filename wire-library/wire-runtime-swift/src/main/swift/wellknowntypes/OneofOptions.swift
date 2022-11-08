// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.OneofOptions in google/protobuf/descriptor.proto
import Foundation

public struct OneofOptions {

    public var unknownFields: Data = .init()

    public init() {
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension OneofOptions : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension OneofOptions : Hashable {
}
#endif

extension OneofOptions : ProtoMessage {
    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/google.protobuf.OneofOptions"
    }
}

extension OneofOptions : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension OneofOptions : Codable {
}
#endif
